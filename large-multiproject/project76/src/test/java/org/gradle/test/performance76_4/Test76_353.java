package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_353 {
    private final Production76_353 production = new Production76_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}