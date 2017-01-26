package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_259 {
    private final Production19_259 production = new Production19_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}