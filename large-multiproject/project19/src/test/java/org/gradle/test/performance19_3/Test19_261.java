package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_261 {
    private final Production19_261 production = new Production19_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}