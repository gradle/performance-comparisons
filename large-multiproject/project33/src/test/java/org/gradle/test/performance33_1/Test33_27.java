package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_27 {
    private final Production33_27 production = new Production33_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}