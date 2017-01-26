package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_425 {
    private final Production66_425 production = new Production66_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}