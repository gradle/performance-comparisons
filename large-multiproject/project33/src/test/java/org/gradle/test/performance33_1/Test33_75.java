package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_75 {
    private final Production33_75 production = new Production33_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}