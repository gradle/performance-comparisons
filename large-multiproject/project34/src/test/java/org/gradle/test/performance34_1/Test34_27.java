package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_27 {
    private final Production34_27 production = new Production34_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}