package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_227 {
    private final Production65_227 production = new Production65_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}