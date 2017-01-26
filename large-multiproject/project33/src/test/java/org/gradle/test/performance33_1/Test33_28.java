package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_28 {
    private final Production33_28 production = new Production33_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}