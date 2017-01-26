package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_43 {
    private final Production17_43 production = new Production17_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}