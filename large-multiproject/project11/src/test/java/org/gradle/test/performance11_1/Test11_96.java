package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_96 {
    private final Production11_96 production = new Production11_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}