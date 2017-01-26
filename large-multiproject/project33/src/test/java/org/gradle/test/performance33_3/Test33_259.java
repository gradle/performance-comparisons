package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_259 {
    private final Production33_259 production = new Production33_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}