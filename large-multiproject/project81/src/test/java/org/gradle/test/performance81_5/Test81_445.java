package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_445 {
    private final Production81_445 production = new Production81_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}