package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_498 {
    private final Production78_498 production = new Production78_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}