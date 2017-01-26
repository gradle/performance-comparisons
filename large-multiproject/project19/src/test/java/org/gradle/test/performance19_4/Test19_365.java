package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_365 {
    private final Production19_365 production = new Production19_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}