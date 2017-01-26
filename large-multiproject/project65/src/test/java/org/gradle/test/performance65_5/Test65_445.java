package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_445 {
    private final Production65_445 production = new Production65_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}