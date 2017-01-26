package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_207 {
    private final Production68_207 production = new Production68_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}