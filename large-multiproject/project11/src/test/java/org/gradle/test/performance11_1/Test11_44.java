package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_44 {
    private final Production11_44 production = new Production11_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}