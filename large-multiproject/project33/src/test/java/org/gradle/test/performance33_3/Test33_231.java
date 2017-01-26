package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_231 {
    private final Production33_231 production = new Production33_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}