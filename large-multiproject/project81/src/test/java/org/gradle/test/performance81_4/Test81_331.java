package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_331 {
    private final Production81_331 production = new Production81_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}