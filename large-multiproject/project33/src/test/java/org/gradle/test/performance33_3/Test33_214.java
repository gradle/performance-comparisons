package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_214 {
    private final Production33_214 production = new Production33_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}