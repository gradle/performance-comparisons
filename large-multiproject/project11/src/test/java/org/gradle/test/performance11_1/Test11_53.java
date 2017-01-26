package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_53 {
    private final Production11_53 production = new Production11_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}