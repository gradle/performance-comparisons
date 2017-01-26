package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_88 {
    private final Production68_88 production = new Production68_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}