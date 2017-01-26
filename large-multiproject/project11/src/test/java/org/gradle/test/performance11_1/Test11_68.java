package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_68 {
    private final Production11_68 production = new Production11_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}