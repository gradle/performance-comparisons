package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_43 {
    private final Production68_43 production = new Production68_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}