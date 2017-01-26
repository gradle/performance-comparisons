package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_10 {
    private final Production33_10 production = new Production33_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}