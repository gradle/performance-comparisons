package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_255 {
    private final Production65_255 production = new Production65_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}