package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_183 {
    private final Production78_183 production = new Production78_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}