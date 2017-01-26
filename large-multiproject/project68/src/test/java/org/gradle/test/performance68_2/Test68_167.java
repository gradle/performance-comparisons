package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_167 {
    private final Production68_167 production = new Production68_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}