package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_353 {
    private final Production68_353 production = new Production68_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}