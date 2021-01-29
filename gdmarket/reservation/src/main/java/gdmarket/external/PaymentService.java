
package gdmarket.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="payment", url="http://payment:8080")
public interface PaymentService {

    @RequestMapping(method= RequestMethod.GET, path="/payments")
    public void approvePayment(@RequestBody Payment payment);

    @RequestMapping(method= RequestMethod.GET, path="/payments")
    public void cancelPayment(@RequestBody Payment payment);
}