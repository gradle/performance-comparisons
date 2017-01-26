package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_43 {
    private final Production29_43 production = new Production29_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}