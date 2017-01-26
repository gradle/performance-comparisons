package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_119 {
    private final Production65_119 production = new Production65_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}