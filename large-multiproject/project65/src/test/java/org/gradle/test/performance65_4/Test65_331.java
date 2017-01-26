package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_331 {
    private final Production65_331 production = new Production65_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}