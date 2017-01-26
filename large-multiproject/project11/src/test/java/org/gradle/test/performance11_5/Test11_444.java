package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_444 {
    private final Production11_444 production = new Production11_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}