package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_426 {
    private final Production34_426 production = new Production34_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}