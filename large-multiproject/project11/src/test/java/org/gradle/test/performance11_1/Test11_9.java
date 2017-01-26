package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_9 {
    private final Production11_9 production = new Production11_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}