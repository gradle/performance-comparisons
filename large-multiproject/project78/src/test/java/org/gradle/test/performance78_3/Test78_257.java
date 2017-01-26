package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_257 {
    private final Production78_257 production = new Production78_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}