package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_427 {
    private final Production68_427 production = new Production68_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}