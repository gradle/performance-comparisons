package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_42 {
    private final Production33_42 production = new Production33_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}