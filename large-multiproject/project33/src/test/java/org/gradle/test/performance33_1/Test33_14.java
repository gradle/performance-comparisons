package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_14 {
    private final Production33_14 production = new Production33_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}