package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_241 {
    private final Production33_241 production = new Production33_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}