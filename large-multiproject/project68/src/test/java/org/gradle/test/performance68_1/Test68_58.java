package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_58 {
    private final Production68_58 production = new Production68_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}