package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_432 {
    private final Production11_432 production = new Production11_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}