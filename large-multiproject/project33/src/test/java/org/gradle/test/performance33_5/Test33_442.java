package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_442 {
    private final Production33_442 production = new Production33_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}