package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_43 {
    private final Production34_43 production = new Production34_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}