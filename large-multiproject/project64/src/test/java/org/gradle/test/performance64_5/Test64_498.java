package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_498 {
    private final Production64_498 production = new Production64_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}