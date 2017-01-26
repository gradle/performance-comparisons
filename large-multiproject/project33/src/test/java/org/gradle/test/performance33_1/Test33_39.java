package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_39 {
    private final Production33_39 production = new Production33_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}