package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_3 {
    private final Production33_3 production = new Production33_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}