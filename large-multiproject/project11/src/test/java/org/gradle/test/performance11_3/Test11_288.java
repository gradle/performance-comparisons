package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_288 {
    private final Production11_288 production = new Production11_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}