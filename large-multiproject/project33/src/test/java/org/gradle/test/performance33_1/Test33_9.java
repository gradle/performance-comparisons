package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_9 {
    private final Production33_9 production = new Production33_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}