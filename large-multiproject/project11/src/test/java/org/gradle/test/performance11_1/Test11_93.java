package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_93 {
    private final Production11_93 production = new Production11_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}