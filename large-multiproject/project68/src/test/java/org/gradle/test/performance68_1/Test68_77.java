package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_77 {
    private final Production68_77 production = new Production68_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}