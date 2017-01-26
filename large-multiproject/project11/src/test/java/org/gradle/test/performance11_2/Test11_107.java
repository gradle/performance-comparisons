package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_107 {
    private final Production11_107 production = new Production11_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}