package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_154 {
    private final Production33_154 production = new Production33_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}