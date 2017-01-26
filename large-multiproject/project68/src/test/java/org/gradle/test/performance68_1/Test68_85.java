package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_85 {
    private final Production68_85 production = new Production68_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}